# |<<

**作业分割执行 (cca_jobresult / nc.vo.cca.jobresult.JobResultHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1284.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobresult | 作业分割结果 | pk_jobresult | char(20) | √ | 主键 (UFID) |
| 2 | pk_accountbook | 核算账簿 | pk_accountbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 业务单元多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_accperiod | 会计期间 | pk_accperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | pk_costcentergrp | 成本中心组 | pk_costcentergrp | varchar(20) |  | 成本中心组 (costcentergroup) |
| 7 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 8 | pk_tbversion | 预算版本 | pk_tbversion | varchar(20) |  | 版本 (tb_version) |
| 9 | exestatus | 执行状态 | exestatus | varchar(50) |  | 执行状态枚举 (exestatus) |  | 1=未执行; |