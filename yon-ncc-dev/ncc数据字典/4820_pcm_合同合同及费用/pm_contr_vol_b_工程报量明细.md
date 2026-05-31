# |<<

**工程报量明细 (pm_contr_vol_b / nc.vo.pcm.contractvolume.ContractVolumeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4442.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_vol_b | 工程报量明细主键 | pk_contr_vol_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 项目组织多版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 5 | src_rowno | 来源行号 | src_rowno | varchar(50) |  | 字符串 (String) |
| 6 | pk_material | 物料编码多版本 | pk_material | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | pk_material_v | 物料编码 | pk_material_v | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | pk_measdoc | 单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 9 | taxprice | 含税单价 | taxprice | decimal(28, 8) |  | 金额 (UFMoney) |
| 10 | service_prc_ratio | 服务价格系数 | service_prc_ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | vol_num | 数量 | vol_num | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | this_comp_taxmny | 含税金额 | this_comp_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 13 | comp_taxmny | 含税已完成额 | comp_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | cum_comp_taxmny | 含税累计完成额 | cum_comp_taxmny | decimal(28, 8) |  | 金额 (UFMoney) |
| 15 | src_pk_bill | 来源单据 | src_pk_bill | varchar(50) |  | 字符串 (String) |
| 16 | src_bill_code | 来源单据编码 | src_bill_code | varchar(50) |  | 字符串 (String) |
| 17 | src_billtype | 来源单据类型 | src_billtype | varchar(50) |  | 字符串 (String) |
| 18 | pk_contr_works | 合同基本 | pk_contr_works | varchar(20) |  | 合同基本 (works) |
| 19 | pk_contr_supply_b | 补充协议基本 | pk_contr_supply_b | varchar(20) |  | 补充协议明细 (contralterbodyvo) |
| 20 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 21 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |