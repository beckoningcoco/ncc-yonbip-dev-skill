# |<<

**物料加密 (bd_ematerial / nc.vo.bd.ematerial.entity.EMaterialVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/814.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ematerial | 物料加密 | pk_ematerial | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | vciphertext | 物料真名密文 | vciphertext | varchar(256) |  | 字符串 (String) |
| 7 | vpwdkey | 密钥 | vpwdkey | varchar(128) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |