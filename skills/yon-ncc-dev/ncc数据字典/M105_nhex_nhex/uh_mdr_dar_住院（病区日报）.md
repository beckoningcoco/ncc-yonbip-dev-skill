# |<<

**住院（病区日报） (uh_mdr_dar / com.yonyou.yh.nhis.ex.ns.vo.WardDailyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6124.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mdrdar | 主键 | pk_mdrdar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_dept | 临床科室 | pk_dept | varchar(50) |  | 字符串 (String) |
| 5 | pk_dept_ns | 护理单元 | pk_dept_ns | varchar(50) |  | 字符串 (String) |
| 6 | date_sa | 统计日期 | date_sa | char(19) |  | 日期时间 (UFDateTime) |
| 7 | bednum | 额定床位数 | bednum | int |  | 整数 (Integer) |
| 8 | bednum_open | 实际开放床位 | bednum_open | int |  | 整数 (Integer) |
| 9 | inhosp_yd | 昨日留院 | inhosp_yd | int |  | 整数 (Integer) |
| 10 | admit | 今日入院 | admit | int |  | 整数 (Integer) |
| 11 | trans_in | 他科转入 | trans_in | int |  | 整数 (Integer) |
| 12 | discharge | 今日出院 | discharge | int |  | 整数 (Integer) |
| 13 | trans_out | 转往他科 | trans_out | int |  | 整数 (Integer) |
| 14 | inhosp_td | 今日留院 | inhosp_td | int |  | 整数 (Integer) |
| 15 | riskynum | 病危人数 | riskynum | int |  | 整数 (Integer) |
| 16 | severenum | 病重人数 | severenum | int |  | 整数 (Integer) |
| 17 | curenum | 出院治愈人数 | curenum | int |  | 整数 (Integer) |
| 18 | improvenum | 出院好转人数 | improvenum | int |  | 整数 (Integer) |
| 19 | uncurenum | 出院未愈人数 | uncurenum | int |  | 整数 (Integer) |
| 20 | deathnum | 出院死亡人数 | deathnum | int |  | 整数 (Integer) |
| 21 | nursenum | 一级护理人数 | nursenum | int |  | 整数 (Integer) |
| 22 | bednum_empty | 今日空床 | bednum_empty | int |  | 整数 (Integer) |
| 23 | bednum_add | 今日加床 | bednum_add | int |  | 整数 (Integer) |
| 24 | accomnum | 陪住人数 | accomnum | int |  | 整数 (Integer) |
| 25 | num_days | 住院总天数 | num_days | int |  | 整数 (Integer) |
| 26 | note | 备注 | note | varchar(256) |  | 字符串 (String) |
| 27 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 30 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 31 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 32 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 33 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 34 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 35 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 36 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 37 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 38 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 39 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 40 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 41 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 42 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 43 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 44 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 45 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 46 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |