# |<<

**黑名单档案 (hi_psndoc_bad / nc.vo.hi.blacklist.BlacklistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2555.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_bad | 黑名单档案主键 | pk_psndoc_bad | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | psncode | 人员编码 | psncode | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 5 | psnname | 姓名 | psnname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | comefrom | 人员来源 | comefrom | int |  | 整数 (Integer) |
| 7 | sex | 性别 | sex | int |  | 性别 (sex) |  | 1=男; |