# |<<

**渠道管理分类 (dcm_chnlmngtype / nc.vo.scmf.dcm.chnlmngtype.entity.ChnlMngTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1689.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chnlmngtypid | 渠道管理分类 | pk_chnlmngtypid | char(20) | √ | 主键 (UFID) |
| 2 | vcode | 渠道管理分类编码 | vcode | varchar(40) |  | 字符串 (String) |
| 3 | vname | 渠道管理分类名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | cchanltypeid | 渠道类型 | cchanltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 8 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 10 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |