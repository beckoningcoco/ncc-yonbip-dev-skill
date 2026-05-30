# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6433.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_syscatalog | pk_syscatalog | pk_syscatalog | char(20) | √ |
| 2 | allowpartlysuccess | allowpartlysuccess | allowpartlysuccess | char(1) |
| 3 | code | code | code | varchar2(50) | √ |
| 4 | createdversion | createdversion | createdversion | varchar2(50) |
| 5 | datasplitsize | datasplitsize | datasplitsize | number(38, 0) |
| 6 | deletedonsuccess | deletedonsuccess | deletedonsuccess | char(1) |  |  | 'Y' |
| 7 | enablestate | enablestate | enablestate | number(38, 0) |
| 8 | localsystem | localsystem | localsystem | char(1) |
| 9 | msgprocthreads | msgprocthreads | msgprocthreads | number(38, 0) |
| 10 | msgrecvthreads | msgrecvthreads | msgrecvthreads | number(38, 0) |
| 11 | name | name | name | varchar2(300) | √ |
| 12 | name2 | name2 | name2 | varchar2(300) |
| 13 | name3 | name3 | name3 | varchar2(300) |
| 14 | name4 | name4 | name4 | varchar2(300) |
| 15 | name5 | name5 | name5 | varchar2(300) |
| 16 | name6 | name6 | name6 | varchar2(300) |
| 17 | ntpip | ntpip | ntpip | varchar2(200) |
| 18 | ntpport | ntpport | ntpport | number(38, 0) |
| 19 | ntptimeerror | ntptimeerror | ntptimeerror | number(38, 0) |
| 20 | operatorid | operatorid | operatorid | varchar2(20) |  |  | '~' |
| 21 | packstoreroot | packstoreroot | packstoreroot | varchar2(500) |
| 22 | parentid | parentid | parentid | varchar2(20) |  |  | '~' |
| 23 | resprocthreads | resprocthreads | resprocthreads | number(38, 0) |
| 24 | sendmail | sendmail | sendmail | char(1) |  |  | 'N' |
| 25 | sendncmessage | sendncmessage | sendncmessage | char(1) |  |  | 'N' |
| 26 | sendsms | sendsms | sendsms | char(1) |  |  | 'N' |
| 27 | se_maxtrytimes | se_maxtrytimes | se_maxtrytimes | number(38, 0) |
| 28 | se_sendfailpkgfreq | se_sendfailpkgfreq | se_sendfailpkgfreq | number(38, 0) |
| 29 | sysadmin | sysadmin | sysadmin | varchar2(20) |  |  | '~' |
| 30 | updatetime | updatetime | updatetime | char(19) |
| 31 | uuid | uuid | uuid | varchar2(50) |
| 32 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 33 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |