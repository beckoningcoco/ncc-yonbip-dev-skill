# |<<

**薪资员工信息属性表 (wa_psnhi / nc.vo.wa.grade.WaPsnhiVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6349.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_psnhi | 相关员工信息项主键 | pk_wa_psnhi | char(20) | √ | 主键 (UFID) |
| 2 | pk_wa_grd | 薪资标准主键 | pk_wa_grd | char(20) |  | 主键 (UFID) |
| 3 | pk_flddict | 信息属性主键 | pk_flddict | varchar(20) |  | 字符串 (String) |
| 4 | vfldcode | 信息项编码 | vfldcode | varchar(50) |  | 字符串 (String) |
| 5 | classtype | 类别类型 | classtype | int |  | 整数 (Integer) |
| 6 | showorder | 信息项目的顺序 | showorder | int |  | 整数 (Integer) |
| 7 | vfldname | 信息项名称 | vfldname | varchar(50) |  | 字符串 (String) |