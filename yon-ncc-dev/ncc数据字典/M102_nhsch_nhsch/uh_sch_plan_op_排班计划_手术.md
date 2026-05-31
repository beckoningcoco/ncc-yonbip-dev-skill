# |<<

**排班计划_手术 (uh_sch_plan_op / com.yonyou.yh.nhis.sch.sch.vo.SchPlanOpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6260.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_planop | 手术排班计划主键 | pk_planop | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_resop | 手术资源 | pk_resop | varchar(20) |  | 排班_手术资源 (schresop) |
| 5 | weekno | 星期数 | weekno | int |  | 整数 (Integer) |
| 6 | h1 | 1点 | h1 | varchar(50) |  | 字符串 (String) |
| 7 | h2 | 2点 | h2 | varchar(50) |  | 字符串 (String) |
| 8 | h3 | 3点 | h3 | varchar(50) |  | 字符串 (String) |
| 9 | h4 | 4点 | h4 | varchar(50) |  | 字符串 (String) |
| 10 | h5 | 5点 | h5 | varchar(50) |  | 字符串 (String) |
| 11 | h6 | 6点 | h6 | varchar(50) |  | 字符串 (String) |
| 12 | h7 | 7点 | h7 | varchar(50) |  | 字符串 (String) |
| 13 | h8 | 8点 | h8 | varchar(50) |  | 字符串 (String) |
| 14 | h9 | 9点 | h9 | varchar(50) |  | 字符串 (String) |
| 15 | h10 | 10点 | h10 | varchar(50) |  | 字符串 (String) |
| 16 | h11 | 11点 | h11 | varchar(50) |  | 字符串 (String) |
| 17 | h12 | 12点 | h12 | varchar(50) |  | 字符串 (String) |
| 18 | h13 | 13点 | h13 | varchar(50) |  | 字符串 (String) |
| 19 | h14 | 14点 | h14 | varchar(50) |  | 字符串 (String) |
| 20 | h15 | 15点 | h15 | varchar(50) |  | 字符串 (String) |
| 21 | h16 | 16点 | h16 | varchar(50) |  | 字符串 (String) |
| 22 | h17 | 17点 | h17 | varchar(50) |  | 字符串 (String) |
| 23 | h18 | 18点 | h18 | varchar(50) |  | 字符串 (String) |
| 24 | h19 | 19点 | h19 | varchar(50) |  | 字符串 (String) |
| 25 | h20 | 20点 | h20 | varchar(50) |  | 字符串 (String) |
| 26 | h21 | 21点 | h21 | varchar(50) |  | 字符串 (String) |
| 27 | h22 | 22点 | h22 | varchar(50) |  | 字符串 (String) |
| 28 | h23 | 23点 | h23 | varchar(50) |  | 字符串 (String) |
| 29 | h24 | 24点 | h24 | varchar(50) |  | 字符串 (String) |