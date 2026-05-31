# |<<

**薪资级别表 (wa_prmlv / nc.vo.wa.grade.WaPrmlvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6346.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_prmlv | 级别主键 | pk_wa_prmlv | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_grd | 标准类别主键 | pk_wa_grd | char(20) |  | 主键 (UFID) |
| 3 | levelname | 级次名称 | levelname | varchar(100) |  | 字符串 (String) |
| 4 | displayindex | 排列序号 | displayindex | int |  | 整数 (Integer) |