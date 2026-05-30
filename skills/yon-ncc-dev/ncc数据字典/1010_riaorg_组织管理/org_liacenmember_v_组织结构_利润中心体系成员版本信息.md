# |<<

**组织结构_利润中心体系成员版本信息 (org_liacenmember_v / nc.vo.vorg.LiabilityCenterStruMemberVersionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4089.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_smid | 利润中心体系成员主键 | pk_smid | char(20) | √ | 主键 (UFID) |
| 2 | pk_svid | 利润中心体系版本主键 | pk_svid | char(20) | √ | 组织结构_利润中心体系版本信息 (liacenstru_v) |
| 3 | pk_group | 利润中心体系所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_orgvid | 组织版本主键 | pk_orgvid | char(20) | √ | 组织_版本信息 (org_v) |
| 5 | pk_org | 组织主键 | pk_org | char(20) | √ | 组织 (org) |
| 6 | pk_fatherorg | 上级组织主键 | pk_fatherorg | varchar(20) |  | 组织 (org) |