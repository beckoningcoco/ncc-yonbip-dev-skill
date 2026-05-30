# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11000.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_recentvisit | pk_user_recentvisit | pk_user_recentvisit | char(20) | √ |
| 2 | appcode | appcode | appcode | varchar2(50) |
| 3 | appid | appid | appid | varchar2(50) |
| 4 | image_src | image_src | image_src | varchar2(200) |
| 5 | is_cloud_app | is_cloud_app | is_cloud_app | char(1) |
| 6 | label | label | label | varchar2(200) |
| 7 | resid | resid | resid | varchar2(50) |
| 8 | user_id | user_id | user_id | varchar2(20) |  |  | '~' |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |