# |<<

**人员工作记录 (hi_psnjob / nc.vo.hrcm.hrcm_center.PsnjobVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2596.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnjob | 任职记录 | pk_psnjob | char(20) | √ | 主键 (UFID) |
| 2 | pk_psnorg | 组织关系 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 3 | psntype | 人员类型 | psntype | int |  | 人员类型 (PsnType) |  | 0=员工; |