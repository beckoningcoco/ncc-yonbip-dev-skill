# |<<

**组织结构_人力资源组织结构成员版本信息 (org_hrorgmember_v / nc.vo.vorg.HROrgStruMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4082.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_smid | 人力资源组织结构成员主键 | pk_smid | char(20) | √ | 主键 (UFID) |
| 2 | pk_svid | 人力资源组织结构版本主键 | pk_svid | char(20) | √ | 组织结构_人力资源组织结构版本信息 (hrorgstru_v) |
| 3 | pk_group | 人力资源组织结构所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_orgvid | 组织版本主键 | pk_orgvid | char(20) | √ | 组织_版本信息 (org_v) |
| 5 | pk_org | 组织主键 | pk_org | char(20) | √ | 组织 (org) |
| 6 | pk_fatherorg | 上级组织主键 | pk_fatherorg | varchar(20) |  | 组织 (org) |