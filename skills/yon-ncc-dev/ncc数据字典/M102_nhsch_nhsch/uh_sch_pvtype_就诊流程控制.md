# |<<

**就诊流程控制 (uh_sch_pvtype / com.yonyou.yh.nhis.sch.sch.vo.SchPvTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6265.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_schpvtype | 预约就诊类型排班主键 | pk_schpvtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | pk_sch | 排班主键 | pk_sch | varchar(50) |  | 字符串 (String) |
| 5 | pk_pvtype | 就诊类型 | pk_pvtype | varchar(50) |  | 字符串 (String) |
| 6 | count_limit | 限制数量 | count_limit | int |  | 整数 (Integer) |
| 7 | count_used | 已使用数量 | count_used | int |  | 整数 (Integer) |
| 8 | stopflag | 停止标志 | stopflag | char(1) |  | 布尔类型 (UFBoolean) |