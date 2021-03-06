package com.ant.jobgod.jobgod.model;

import android.content.Context;

import com.ant.jobgod.jobgod.config.API;
import com.ant.jobgod.jobgod.model.bean.AroundPersonBriefPage;
import com.ant.jobgod.jobgod.model.bean.JobBrief;
import com.ant.jobgod.jobgod.model.bean.PersonBrief;
import com.ant.jobgod.jobgod.model.bean.UserDetail;
import com.ant.jobgod.jobgod.model.callback.DataCallback;
import com.ant.jobgod.jobgod.model.callback.StatusCallback;
import com.jude.beam.model.AbsModel;
import com.jude.http.RequestManager;
import com.jude.http.RequestMap;

/**
 * Created by Mr.Jude on 2015/6/6.
 * 关于用户数据的处理。
 */
    public class UserModel extends AbsModel {
        public static UserModel getInstance() {
            return getInstance(UserModel.class);
        }

        @Override
        protected void onAppCreate(Context ctx) {
            super.onAppCreate(ctx);
        }

        public void modifyName(String name, StatusCallback callback) {
            RequestManager.getInstance().post(API.URL.ModifyName, new RequestMap("name", name), callback);
        }

        public void modifySign(String sign, StatusCallback callback) {
            RequestManager.getInstance().post(API.URL.ModifySign, new RequestMap("sign", sign), callback);
        }
        public void modifyFace(String small,String large,StatusCallback callback){
            RequestMap params = new RequestMap();
            params.put("small",small);
            params.put("large",large);
            RequestManager.getInstance().post(API.URL.ModifyFace,params,callback);
        }

        public void authentication(String name,String idNumber,String path,StatusCallback callback){
            RequestMap params = new RequestMap();
            params.put("real_name",name);
            params.put("id_card",idNumber);
            params.put("img",path);
            RequestManager.getInstance().post(API.URL.Authentication,params,callback);
        }


        public void getCollection(DataCallback<JobBrief[]> callback){
            RequestManager.getInstance().post(API.URL.GetCollections,null,callback);
        }

        public void getAttentionFromMe(DataCallback<PersonBrief[]> callback){
            RequestManager.getInstance().post(API.URL.GetAttentionFromMe,null,callback);
        }

        public void getAttentionToMe(DataCallback<PersonBrief[]> callback){
            RequestManager.getInstance().post(API.URL.GetAttentionToMe,null,callback);
        }

        public void getJoin(DataCallback<JobBrief[]> callback){
            RequestManager.getInstance().post(API.URL.GetJoin,null,callback);
        }

        public void getUserDetail(String id,DataCallback<UserDetail> callback){
            RequestManager.getInstance().post(API.URL.GetUserDetail,new RequestMap("id",id),callback);
        }

        public void updateUserDetail(UserDetail userDetail,StatusCallback callback){
            RequestMap params = new RequestMap();

            params.put("eduLevel", userDetail.getEduLevel()+"");
            params.put("major", userDetail.getMajor());
            params.put("school", userDetail.getSchool());
            params.put("birthday", userDetail.getBirthday() + "");
            params.put("gender", userDetail.getGender() + "");
            params.put("height", userDetail.getHeight() + "");
            params.put("award", userDetail.getAward());
            params.put("certificate", userDetail.getCertificate());
            params.put("character", userDetail.getCharacter());
            params.put("like", userDetail.getLike());
            params.put("specialty", userDetail.getSpecialty());
            params.put("intro", userDetail.getIntro());
            RequestManager.getInstance().post(API.URL.UpdateUserDetail, params, callback);
        }

        /**
         * 获取附近的人
         * @param page
         * @param count
         * @param callback
         */
        public void getAroundUsers(int page, int count, DataCallback<AroundPersonBriefPage> callback) {
            RequestMap params = new RequestMap();
            params.put("page", page + "");
            params.put("count", count + "");
            RequestManager.getInstance().post(API.URL.GetAroundFriends, params, callback);
        }

        /**
         *关注他人
         * @param id
         * @param callback
         */
        public void attention(int id, StatusCallback callback) {
            RequestManager.getInstance().post(API.URL.Attention, new RequestMap("id", id+""), callback);
        }

        /**
         * 取消关注他人
         * @param id
         * @param callback
         */
        public void unAttention(int id, StatusCallback callback) {
            RequestManager.getInstance().post(API.URL.UnAttention, new RequestMap("id", id+""), callback);
        }


    }
