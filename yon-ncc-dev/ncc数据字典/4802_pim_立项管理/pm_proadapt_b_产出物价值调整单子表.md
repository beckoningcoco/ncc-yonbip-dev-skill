# |<<

**产出物价值调整单子表 (pm_proadapt_b / nc.vo.ppm.productadapt.ProAdaptBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4502.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proadapt_b | 产出物价值调整单子表主键 | pk_proadapt_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | rowno | 行号 | rowno | varchar(20) |  | 字符串 (String) |
| 6 | pk_projectproduct | 产出物编码 | pk_projectproduct | varchar(20) |  | 项目产出物 (projectproduct) |
| 7 | trafamoney | 交付价值 | trafamoney | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | alterflag | 改造维修 | alterflag | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | adjustamoney | 累计调整价值 | adjustamoney | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 10 | adjustamoney_group | 累计调整价值(集团币) | adjustamoney_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 11 | adjustamoney_global | 累计调整价值(全局币) | adjustamoney_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 12 | adapt_mny | 本次调整价值 | adapt_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 13 | adapt_mny_group | 本次调整价值(集团币) | adapt_mny_group | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 14 | adapt_mny_global | 本次调整价值(全局币) | adapt_mny_global | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 15 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 16 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 17 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 18 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 19 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |