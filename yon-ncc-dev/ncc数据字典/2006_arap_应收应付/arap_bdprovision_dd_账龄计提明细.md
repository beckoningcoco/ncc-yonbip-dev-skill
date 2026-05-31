# |<<

**账龄计提明细 (arap_bdprovision_dd / nccloud.vo.arap.bdprovision.BdProvisionDetailPeriodVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/159.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bdprovision_dd | 主键 | pk_bdprovision_dd | char(20) | √ | 主键 (UFID) |
| 2 | pk_bdprovision_d | 坏账计提明细主键 | pk_bdprovision_d | varchar(20) |  | 坏账计提明细 (bdprovision_d) |
| 3 | agingperiod | 账龄区间主键 | agingperiod | varchar(20) |  | 账龄期间设置明细 (TimeCtrlDetail) |
| 4 | dimratio | 计提比率 | dimratio | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 5 | totalar | 应收账款总额 | totalar | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 6 | initbdreserve | 期初坏账准备 | initbdreserve | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 7 | endbdreserve | 期末坏账准备 | endbdreserve | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 8 | money | 计提原币金额 | money | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 9 | localmoney | 计提组织本币金额 | localmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 10 | groupmoney | 计提集团本币金额 | groupmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |
| 11 | globalmoney | 计提全局本币金额 | globalmoney | decimal(28, 8) |  | 数值 (UFDouble) | 0 |