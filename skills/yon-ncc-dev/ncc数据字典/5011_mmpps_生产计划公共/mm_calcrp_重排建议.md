# |<<

**重排建议 (mm_calcrp / nc.vo.mmpps.calc.entity.rp.RescheduleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3649.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crpid | 重排建议 | crpid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cpsid | 方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 6 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | frptype | 重排建议类型 | frptype | int |  | 重排建议类型 (RPType) |  | 0=提前; |