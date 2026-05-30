# |<<

**合同条款 (alo_contract_i / nc.vo.alo.contract.leasecont.ContractOutItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/87.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contract_i | 合同条款主键 | pk_contract_i | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_contract_item | 条款编码 | pk_contract_item | varchar(20) |  | 合同条款 (ct_termset) |
| 6 | item_content | 条款内容 | item_content | varchar(996) |  | 备注 (Memo) |
| 7 | other_info | 其他信息 | other_info | varchar(200) |  | 字符串 (String) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |