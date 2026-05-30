# |<<

**人员基本信息 (bd_psndoc / nc.vo.bd.psn.PsndocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc | 人员基本信息主键 | pk_psndoc | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属业务单元 | pk_org | char(20) | √ | 组织 (org) |
| 3 | code | 人员编码 | code | varchar(40) | √ | 字符串 (String) |
| 4 | name | 姓名 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 5 | usedname | 曾用名 | usedname | varchar(200) |  | 字符串 (String) |
| 6 | birthdate | 出生日期 | birthdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 7 | sex | 性别 | sex | smallint |  | 性别 (sex) |  | 1=男; |