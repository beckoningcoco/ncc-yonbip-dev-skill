# |<<

**验收单基本信息 (pam_acceptance_b / nc.vo.aim.acceptance.AcceptanceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4211.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_acceptance_b | 验收单基本信息主键 | pk_acceptance_b | char(20) | √ | 主键 (UFID) |
| 2 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 3 | pk_jobmngfil | 项目 | pk_jobmngfil | varchar(20) |  | 项目 (project) |
| 4 | verifier | 确认人 | verifier | varchar(20) |  | 用户 (user) |
| 5 | acceptflag | 验收通过 | acceptflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | acceptconclusion | 验收结论 | acceptconclusion | varchar(1000) |  | 字符串 (String) |
| 7 | accetpcontent | 验收内容 | accetpcontent | varchar(1000) |  | 字符串 (String) |
| 8 | deliveryattached | 随机资料 | deliveryattached | varchar(1000) |  | 字符串 (String) |
| 9 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 10 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 11 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 12 | equip_name | 资产名称 | equip_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 13 | pk_used_status | 资产使用状态 | pk_used_status | varchar(20) |  | 设备状态 (StatusVO) |
| 14 | pk_used_status_after | 变动后资产使用状态 | pk_used_status_after | varchar(20) |  | 设备状态 (StatusVO) |
| 15 | pk_srcdist_b | 资产来源 | pk_srcdist_b | varchar(20) |  | 设备来源表体 (SrcDistBodyVo) |
| 16 | pk_bill_b_src | 来源单据表体主键 | pk_bill_b_src | varchar(20) |  | 字符串 (String) |
| 17 | bill_code_src | 来源单据编码 | bill_code_src | varchar(40) |  | 字符串 (String) |
| 18 | pk_bill_src | 来源单据主键 | pk_bill_src | varchar(20) |  | 字符串 (String) |
| 19 | transi_type_src | 来源交易类型 | transi_type_src | varchar(30) |  | 字符串 (String) |
| 20 | bill_type_src | 来源单据类型 | bill_type_src | varchar(4) |  | 字符串 (String) |
| 21 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 61 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 62 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 63 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 64 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 65 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 66 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 67 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 68 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 69 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 70 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |