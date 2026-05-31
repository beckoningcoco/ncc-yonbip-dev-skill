# |<<

**最近访问 (pub_user_recentvisit / nc.vo.platform.workbench.model.AppUseRecentVisitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4783.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_recentvisit | 主键 | pk_user_recentvisit | char(20) | √ | 主键 (UFID) |
| 2 | user_id | 用户id | user_id | varchar(50) |  | 字符串 (String) |
| 3 | appcode | 应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 4 | appid | 应用主键 | appid | varchar(50) |  | 字符串 (String) |
| 5 | is_cloud_app | 是否云应用 | is_cloud_app | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | label | 显示名称 | label | varchar(200) |  | 字符串 (String) |
| 7 | image_src | 图标显示 | image_src | varchar(200) |  | 字符串 (String) |
| 8 | resid | 应用多语id | resid | varchar(50) |  | 字符串 (String) |