# |<<

**物料清单多产出快照 (mm_calcbomoutput / nc.vo.mmpps.bomsnap.entity.BomOutputSnapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3639.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsbomoutputid | 物料清单多产出快照主键 | cppsbomoutputid | char(36) | √ | 主键 (UFID) |
| 2 | cppsmaterialid | 物料范围主键 | cppsmaterialid | char(36) |  | 字符串 (String) |
| 3 | computecode | 运算号 | computecode | varchar(40) |  | 字符串 (String) |
| 4 | schemeid | 计划方案 | schemeid | varchar(20) |  | 计划方案 (mm_ps) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 7 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | cbomid | 物料清单表头主键 | cbomid | varchar(20) |  | 字符串 (String) |
| 9 | cbomoutputid | 物料清单多产出主键 | cbomoutputid | varchar(20) |  | 字符串 (String) |
| 10 | foutputtype | 产出类型 | foutputtype | int |  | 产出类型 (outputtype) |  | 1=主产品; |