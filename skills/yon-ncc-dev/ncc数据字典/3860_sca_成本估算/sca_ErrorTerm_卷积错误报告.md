# |<<

**卷积错误报告 (sca_ErrorTerm / nc.vo.sca.stdcostconv.ErrorTerm)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5053.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_converror | 错误报告主键 | pk_converror | char(20) | √ | 主键 (UFID) |
| 2 | costdomainid | 成本域 | costdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | materialid | 物料 | materialid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 6 | ccostregionid_source | 来源成本域 | ccostregionid_source | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | ccostregionid_aim | 目的成本域 | ccostregionid_aim | varchar(20) |  | 组织_成本域 (costregion) |
| 8 | stockorg_source | 来源业务单元 | stockorg_source | varchar(20) |  | 组织 (org) |
| 9 | stockorg_aim | 目的业务单元 | stockorg_aim | varchar(20) |  | 组织 (org) |
| 10 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 11 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 12 | explain | 说明 | explain | varchar(200) |  | 字符串 (String) |
| 13 | check_type | 错误类型 | check_type | varchar(50) |  | 卷积检查项 (ConvCheckEnum) |  | 1=未获取到物料价格; |