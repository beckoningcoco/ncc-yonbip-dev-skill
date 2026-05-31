# |<<

**预结算费用明细信息 (nhhp_country_prepay_mx / com.yonyou.yh.nhis.hp.zzhp.pub.country.vo.ZZHPPREPAYMXVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_premx | 主键 | pk_premx | char(20) | √ | 主键 (UFID) |
| 2 | n709_01 | 住院处方流水号 | n709_01 | varchar(50) |  | 字符串 (String) |
| 3 | n709_05 | HIS 系统项目代码 | n709_05 | varchar(50) |  | 字符串 (String) |
| 4 | n709_06 | HIS 系统项目名称 | n709_06 | varchar(50) |  | 字符串 (String) |
| 5 | n709_07 | 费用金额 | n709_07 | varchar(50) |  | 字符串 (String) |
| 6 | n709_08 | 报销金额 | n709_08 | varchar(50) |  | 字符串 (String) |
| 7 | n709_09 | 扣减金额 | n709_09 | varchar(50) |  | 字符串 (String) |
| 8 | n709_10 | 扣减原因 | n709_10 | varchar(50) |  | 字符串 (String) |
| 9 | n708_01 | HIS 系统单据编码 | n708_01 | varchar(50) |  | 字符串 (String) |
| 10 | n708_02 | 住院登记流水号 | n708_02 | varchar(50) |  | 字符串 (String) |
| 11 | pk_pre | 外键 | pk_pre | varchar(50) |  | 字符串 (String) |
| 12 | st_flag | 结算方式标志 | st_flag | varchar(50) |  | 字符串 (String) |