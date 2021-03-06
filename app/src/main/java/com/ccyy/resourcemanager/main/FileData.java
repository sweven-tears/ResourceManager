package com.ccyy.resourcemanager.main;

import android.graphics.Bitmap;

import java.util.Date;

/**
 * Created by Sweven on 2018/6/13.
 * Email:sweventears@Foxmail.com
 */
public class FileData {
    public String name;
    public String path;
    public Bitmap fileIcon;
    public long last_date;
    public long size;
    public int folder_count;
    public int file_count;

    public boolean isCheck;

    /**
     * 适用于TXT文件的操作
     *
     * @param name      文件名
     * @param path      文件地址
     * @param last_date 最后修改时间
     * @param size      文件大小
     * @param isCheck   是否被选中
     */
    public FileData(String name, String path, long last_date, long size, boolean isCheck) {
        this.name = name;
        this.path = path;
        this.last_date = last_date;
        this.size = size;
        this.isCheck = isCheck;
    }

    /**
     * 该构造方法适用于文件浏览
     *
     * @param name      文件名
     * @param path      文件地址
     * @param fileIcon  文件对应图标
     * @param last_date 最后修改日期
     * @param size      文件大小
     * @param isCheck   文件是否被选中
     */
    public FileData(String name, String path, Bitmap fileIcon, long last_date, long size, boolean isCheck) {
        this.name = name;
        this.path = path;
        this.fileIcon = fileIcon;
        this.last_date = last_date;
        this.size = size;
        this.isCheck = isCheck;
    }

    /**
     * 目前用于浏览文件夹
     *
     * @param name 文件名称
     * @param path 文件地址
     */
    public FileData(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Bitmap getFileIcon() {
        return fileIcon;
    }

    public void setFileIcon(Bitmap fileIcon) {
        this.fileIcon = fileIcon;
    }

    public long getLast_date() {
        return last_date;
    }

    public void setLast_date(long last_date) {
        this.last_date = last_date;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getFolder_count() {
        return folder_count;
    }

    public void setFolder_count(int folder_count) {
        this.folder_count = folder_count;
    }

    public int getFile_count() {
        return file_count;
    }

    public void setFile_count(int file_count) {
        this.file_count = file_count;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }
}
