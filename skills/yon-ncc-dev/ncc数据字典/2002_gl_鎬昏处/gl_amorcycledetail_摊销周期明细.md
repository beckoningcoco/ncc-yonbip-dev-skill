# |<<

**摊销周期明细 (gl_amorcycledetail / nc.vo.gl.amortize.setting.AmorCycleDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2343.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cycledetail | 周期明细标识 | pk_cycledetail | varchar(50) | √ | 字符串 (String) |
| 2 | no | 序号 | no | int |  | 整数 (Integer) |
| 3 | rate | 比例 | rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 4 | amount | 金额 | amount | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | remarks | 备注 | remarks | varchar(1000) |  | 字符串 (String) |
| 6 | pk_voucher | 凭证编号 | pk_voucher | varchar(50) |  | 字符串 (String) |
| 7 | pk_accperiodmonth | 预执行期间 | pk_accperiodmonth | varchar(50) |  | 字符串 (String) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 9 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 10 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 字符串 (String) |
| 11 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |