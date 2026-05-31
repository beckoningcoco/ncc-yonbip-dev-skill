# |<<

**凭证明细 (iufo_vouch_body / nc.vo.hbbb.vouch.VouchBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3534.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 明细主键 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | iorder | 分录号 | iorder | int |  | 整数 (Integer) |
| 3 | digest | 摘要 | digest | varchar(200) |  | 字符串 (String) |
| 4 | pk_selforg | 本方组织 | pk_selforg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | pk_countorg | 对方组织 | pk_countorg | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 6 | pk_measure | 合并报表项目 | pk_measure | varchar(20) |  | 合并报表项目 (project) |
| 7 | debitamount | 借方金额 | debitamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | creditamount | 贷方金额 | creditamount | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | note | 备注 | note | varchar(200) |  | 字符串 (String) |
| 10 | pk_vouchhead | 凭证主键 | pk_vouchhead | varchar(20) |  | 凭证头 (iufoVouchHead) |
| 11 | hbprojectname | 合并报表项目名称 | hbprojectname | varchar(200) |  | 字符串 (String) |