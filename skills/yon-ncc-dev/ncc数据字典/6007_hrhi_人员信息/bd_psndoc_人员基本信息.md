# |<<

**人员基本信息 (bd_psndoc / nc.vo.hi.psndoc.PsndocVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/944.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc | 人员 | pk_psndoc | char(20) | √ | 主键 (UFID) |
| 2 | code | 人员编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 姓名 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | shortname | 姓名简拼 | shortname | varchar(200) |  | 字符串 (String) |
| 5 | idtype | 证件类型 | idtype | varchar(20) | √ | 证件类别 (psnidtype) |
| 6 | id | 证件号码 | id | varchar(25) | √ | 字符串 (String) |
| 7 | photo | 照片 | photo | image |  | 图片类型 (IMAGE) |
| 8 | sex | 性别 | sex | smallint |  | 性别 (sex) |  | 1=男; |