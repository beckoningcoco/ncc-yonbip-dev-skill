# |<<

**现金流量科目对应规则 (gl_subrelation / nc.vo.gl.subjrelation.subrelationvo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2483.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subrelation | 对应规则标识 | pk_subrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 4 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 5 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(50) |  | 字符串 (String) |
| 6 | pk_cashflow | 现金流量表项 | pk_cashflow | char(20) | √ | 主键 (UFID) |
| 7 | pk_debitsubject | 借方科目 | pk_debitsubject | char(20) |  | 主键 (UFID) |
| 8 | dfreevalueid | 借方辅助核算 | dfreevalueid | char(20) |  | 主键 (UFID) |
| 9 | isdd | 是否借方默认 | isdd | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_creditsubject | 贷方科目 | pk_creditsubject | char(20) |  | 主键 (UFID) |
| 11 | cfreevalueid | 贷方辅助核算 | cfreevalueid | char(20) |  | 主键 (UFID) |
| 12 | iscd | 是否贷方默认 | iscd | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | aspect | 流入流出方向 | aspect | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | scale | 比例 | scale | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | memo | 备注 | memo | varchar(50) |  | 字符串 (String) |
| 16 | pk_sob | 来源主键 | pk_sob | varchar(50) |  | 字符串 (String) |
| 17 | pk_unit | 业务单元 | pk_unit | char(20) |  | 主键 (UFID) |