# React-Native-mJcore

[![npm version](https://badge.fury.io/js/react-native-mjcore.svg)](https://badge.fury.io/js/react-native-mjcore)

iOS Version（noidfa）: 5.6.0

Android Version: 5.6.0

## 此项目基于[https://github.com/jpush/jcore-react-native](https://github.com/jpush/jcore-react-native)

## 安装

```sh
npm install react-native-mjcore --save
```

## 接口

```js
// 隐私合规同意之后调用
setAuth(boolen);

// 设置国家码，仅Android
setCountryCode({
    code: '86',
});

// 设置是否自动唤醒（默认是开的），仅Android
enableAutoWakeup(boolen)
```
