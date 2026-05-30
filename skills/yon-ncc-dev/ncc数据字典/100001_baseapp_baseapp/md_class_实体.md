# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3599.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | classID | id | varchar(50) | √ | 字符串 (String) |
| 2 | versiontype | 版本标识 | versiontype | integer | √ | 整数 (Integer) |
| 3 | parentclassid | 父实体ID | parentclassid | varchar(50) |  | 字符串 (String) |
| 4 | componentid | 组件ID | componentid | varchar(50) |  | 字符串 (String) |
| 5 | keyattribute | 主键属性 | keyattribute | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | displayname | 显示名称 | displayname | varchar(60) |  | 字符串 (String) |
| 8 | description | 描述信息 | description | varchar(512) |  | 字符串 (String) |
| 9 | help | 帮助信息 | help | varchar(1024) |  | 字符串 (String) |
| 10 | fullclassname | 类全路径名称 | fullclassname | varchar(256) |  | 字符串 (String) |
| 11 | classtype | 数据类型 | classtype | integer |  | 整数 (Integer) |
| 12 | accessorclassname | 访问器对应类名 | accessorclassname | varchar(256) |  | 字符串 (String) |
| 13 | fixedlength | 是否定长 | fixedlength | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | minvalue | 最小值 | minvalue | varchar(50) |  | 字符串 (String) |
| 15 | maxvalue | 最大值 | maxvalue | varchar(50) |  | 字符串 (String) |
| 16 | length | 长度 | length | integer |  | 整数 (Integer) |
| 17 | precise | 精度 | precise | integer |  | 整数 (Integer) |
| 18 | refmodelname | 参照名称 | refmodelname | varchar(256) |  | 字符串 (String) |
| 19 | returntype | 枚举类型返回类型 | returntype | varchar(50) |  | 字符串 (String) |
| 20 | isprimary | 是否主实体 | isprimary | char(1) |  | 布尔类型 (UFBoolean) |
| 21 | isactive | 是否启用 | isactive | char(1) |  | 布尔类型 (UFBoolean) |
| 22 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 23 | modifytime | 修改时间 | modifytime | char(19) |  | 日期时间 (UFDateTime) |
| 24 | isauthen | 是否安全授权 | isauthen | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | resid | 名称资源ID | resid | varchar(60) |  | 字符串 (String) |
| 26 | bizitfimpclassname | 业务接口实现类 | bizitfimpclassname | varchar(256) |  | 字符串 (String) |
| 27 | modinfoclassname | 元数据动态修改类 | modinfoclassname | varchar(256) |  | 字符串 (String) |
| 28 | creator | 创建人 | creator | varchar(30) |  | 字符串 (String) |
| 29 | modifier | 修改人 | modifier | varchar(30) |  | 字符串 (String) |