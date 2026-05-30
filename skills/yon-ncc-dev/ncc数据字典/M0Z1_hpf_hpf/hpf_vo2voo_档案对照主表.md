# |<<

**档案对照主表 (hpf_vo2voo / nc.vo.hpf.hpfc.docref.Vo2Vo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2650.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_interdocref | 主键 | pk_interdocref | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_mid_ref | 来源档案类型 | pk_mid_ref | varchar(20) |  | 参照信息 (bd_refinfo) |
| 6 | bmout | 来源档案是否外部系统 | bmout | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | msyscode | 来源档案数据来源 | msyscode | varchar(20) |  | 数据来源系统设置 (EntryconfigVO) |
| 8 | pk_hrp_ref | 目的档案类型 | pk_hrp_ref | varchar(20) |  | 参照信息 (bd_refinfo) |
| 9 | bhout | 目的档案是否外部系统 | bhout | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | hsyscode | 目的档案数据来源 | hsyscode | varchar(50) |  | 字符串 (String) |
| 11 | idissys | 目的系统 | idissys | int |  | 目标系统 (DisSysEnum) |  | 1=总账; |