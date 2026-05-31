# |<<

**状态变化设置 (pm_tansirule_cha / nc.vo.pmbd.pmtransirule.TransiRuleChaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4540.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_tansirule_cha | 主键 | pk_tansirule_cha | char(20) | √ | 主键 (UFID) |
| 2 | pk_state_before | 处理前状态 | pk_state_before | varchar(20) |  | 项目状态 (projectstateVO) |
| 3 | pk_state_after | 处理后状态 | pk_state_after | varchar(20) |  | 项目状态 (projectstateVO) |