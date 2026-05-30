# |<<

**个人银行账户 (bd_psnbankacc / nc.vo.bd.psnbankacc.PsnBankaccVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/941.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psnbankacc | 个人银行账户主键 | pk_psnbankacc | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属业务单元 | pk_org | varchar(0) |  | 组织 (org) |
| 3 | pk_psndoc | 人员编码 | pk_psndoc | varchar(20) |  | 人员基本信息 (psndoc) |
| 4 | isexpenseacc | 默认报销卡 | isexpenseacc | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | payacc | 工资卡 | payacc | int |  | 工资卡 (payacc) |  | 1=工资卡1; |