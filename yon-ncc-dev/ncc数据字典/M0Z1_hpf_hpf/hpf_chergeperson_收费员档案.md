# |<<

**收费员档案 (hpf_chergeperson / nc.vo.hpf.chargeperson.ChargePersonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2613.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_person | 主键 | pk_person | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | syscode | 来源系统 | syscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 6 | bsealflag | 是否封存 | bsealflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | id | id | id | char(20) |  | 主键 (UFID) |
| 8 | code | 收费员编码 | code | varchar(50) |  | 字符串 (String) |
| 9 | name | 收费员名称 | name | varchar(50) |  | 字符串 (String) |
| 10 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 11 | source | 来源 | source | varchar(50) |  | 数据来源 (DataSource) |  | 1=HIS系统; |