# |<<

**账簿_组织关账模块期间 (uap_closeaccmodule / nc.vo.org.CloseAccModuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5841.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_closeaccmodule | 主键 | pk_closeaccmodule | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_accperiodscheme | 期间方案 | pk_accperiodscheme | varchar(20) |  | 会计期间方案 (accperiodscheme) |
| 4 | pk_checkaccbook | 财务核算账簿 | pk_checkaccbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_liabilitybook | 责任核算账簿 | pk_liabilitybook | varchar(20) |  | 账簿_责任核算账簿 (liabilitybook) |
| 6 | pk_costregion | 成本域 | pk_costregion | varchar(20) |  | 组织_成本域 (costregion) |
| 7 | pk_accperiodmonth | 启用期间 | pk_accperiodmonth | varchar(20) |  | 会计月份 (accperiodmonth) |
| 8 | moduleid | 模块号 | moduleid | varchar(50) |  | 字符串 (String) |
| 9 | orgtype | 组织类型 | orgtype | varchar(50) |  | 字符串 (String) |
| 10 | pk_storedoc | 仓库 | pk_storedoc | varchar(20) |  | 仓库 (stordoc) |