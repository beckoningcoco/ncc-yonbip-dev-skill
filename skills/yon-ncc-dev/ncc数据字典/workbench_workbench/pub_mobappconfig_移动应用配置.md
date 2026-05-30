# |<<

**移动应用配置 (pub_mobappconfig / nc.vo.workbench.mobappconfig.MobAppConfigVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4736.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | 移动应用配置主键 | pk | char(20) | √ | 主键 (UFID) |
| 2 | appcode | 应用编码 | appcode | varchar(50) |  | 字符串 (String) |
| 3 | appname | 应用名称 | appname | varchar(50) |  | 字符串 (String) |
| 4 | appid | 应用id | appid | varchar(50) |  | 字符串 (String) |
| 5 | appopenurl | 应用打开的相对路径 | appopenurl | varchar(200) |  | 字符串 (String) |
| 6 | zipurl | zip包路径 | zipurl | varchar(200) |  | 字符串 (String) |
| 7 | version | zip包版本 | version | int |  | 整数 (Integer) |
| 8 | ofline | 是否离线应用 | ofline | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | imageurl | 图片url | imageurl | varchar(50) |  | 字符串 (String) |
| 10 | domain | 所属分组 | domain | varchar(20) |  | 所属分组 (AppGroup) |  | SCM=供应链; |