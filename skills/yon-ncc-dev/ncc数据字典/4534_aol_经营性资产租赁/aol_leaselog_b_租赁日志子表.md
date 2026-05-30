# |<<

**租赁日志子表 (aol_leaselog_b / nc.vo.aol.lease.leaselog.LeaseLogBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/121.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_leaselog_b | 租赁日志子表主键 | pk_leaselog_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_lease_target | 租赁对象 | pk_lease_target | varchar(20) |  | 租赁对象 (LeaseTargetVO) |
| 6 | start_date | 开始日期 | start_date | char(19) |  | 日期(开始) (UFDateBegin) |
| 7 | end_date | 结束日期 | end_date | char(19) |  | 日期(结束) (UFDateEnd) |
| 8 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 9 | matter | 事项 | matter | varchar(400) |  | 字符串 (String) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def21 | 自定义项21 | def21 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def22 | 自定义项22 | def22 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def23 | 自定义项23 | def23 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def24 | 自定义项24 | def24 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def25 | 自定义项25 | def25 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def26 | 自定义项26 | def26 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def27 | 自定义项27 | def27 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def28 | 自定义项28 | def28 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def29 | 自定义项29 | def29 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def30 | 自定义项30 | def30 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def31 | 自定义项31 | def31 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def32 | 自定义项32 | def32 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def33 | 自定义项33 | def33 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def34 | 自定义项34 | def34 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def35 | 自定义项35 | def35 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def36 | 自定义项36 | def36 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def37 | 自定义项37 | def37 | varchar(101) |  | 自定义项 (Custom) |
| 47 | def38 | 自定义项38 | def38 | varchar(101) |  | 自定义项 (Custom) |
| 48 | def39 | 自定义项39 | def39 | varchar(101) |  | 自定义项 (Custom) |
| 49 | def40 | 自定义项40 | def40 | varchar(101) |  | 自定义项 (Custom) |
| 50 | def41 | 自定义项41 | def41 | varchar(101) |  | 自定义项 (Custom) |
| 51 | def42 | 自定义项42 | def42 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def43 | 自定义项43 | def43 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def44 | 自定义项44 | def44 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def45 | 自定义项45 | def45 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def46 | 自定义项46 | def46 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def47 | 自定义项47 | def47 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def48 | 自定义项48 | def48 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def49 | 自定义项49 | def49 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def50 | 自定义项50 | def50 | varchar(101) |  | 自定义项 (Custom) |