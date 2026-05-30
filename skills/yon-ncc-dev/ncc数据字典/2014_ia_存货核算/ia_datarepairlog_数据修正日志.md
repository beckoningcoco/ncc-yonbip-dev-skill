# |<<

**数据修正日志 (ia_datarepairlog / nc.vo.ia.monthaccount.entity.DataRepairLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2800.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cdatarepairlogid | 数据调整日志主键 | cdatarepairlogid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 所属账簿 | pk_book | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 4 | pk_org | 成本域 | pk_org | varchar(20) |  | 组织_成本域 (costregion) |
| 5 | cbeginperiod | 起始会计期间 | cbeginperiod | char(7) |  | 字符串 (String) |
| 6 | cendperiod | 结束会计期间 | cendperiod | char(7) |  | 字符串 (String) |
| 7 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 8 | chandler | 操作人 | chandler | varchar(20) |  | 人员基本信息 (psndoc) |
| 9 | fhandletypeflag | 操作类型 | fhandletypeflag | int |  | 整数 (Integer) |