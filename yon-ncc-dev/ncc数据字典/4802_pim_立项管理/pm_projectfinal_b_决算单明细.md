# |<<

**决算单明细 (pm_projectfinal_b / nc.vo.pbm.projectfinal.ProjectFinalBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4511.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectfinal_b | 决算单明细主键 | pk_projectfinal_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | pk_projectproduct | 产出物编码 | pk_projectproduct | varchar(20) |  | 项目产出物 (projectproduct) |
| 6 | weight | 产出物权重 | weight | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | percent_weight | 权重百分比（%） | percent_weight | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | apportion_mny | 分摊价值 | apportion_mny | decimal(28, 8) |  | 金额 (UFMoney) |
| 9 | apportion_group | 分摊价值（集团币） | apportion_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | apportion_global | 分摊价值（全局币） | apportion_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 11 | prod_value | 产出物价值 | prod_value | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | prod_value_group | 产出物价值（集团币） | prod_value_group | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | prod_value_global | 产出物价值（全局币） | prod_value_global | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 15 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |