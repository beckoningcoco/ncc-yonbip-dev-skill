# |<<

**应用资产实体版本 (aam_appassetversion / nc.vo.ncaam.appasset.AppAssetVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_version | 版本主键 | pk_version | char(20) | √ | 主键 (UFID) |
| 2 | pk_asset | 资产主键 | pk_asset | char(20) | √ | 主键 (UFID) |
| 3 | vno | 版本号 | vno | varchar(50) | √ | 字符串 (String) |
| 4 | vname | 版本名 | vname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | vstartdate | 版本生效日期 | vstartdate | char(19) |  | 日期时间 (UFDateTime) |
| 6 | venddate | 版本失效日期 | venddate | char(19) |  | 日期时间 (UFDateTime) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |