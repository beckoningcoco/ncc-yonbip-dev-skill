# |<<

**报表项目 (far_reportitem / nc.vo.far.baseinfo.ReportItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportitem | 主键 | pk_reportitem | char(20) | √ | 主键 (UFID) |
| 2 | itemcode | 项目编码 | itemcode | varchar(50) |  | 字符串 (String) |
| 3 | itemname | 项目名称 | itemname | varchar(200) |  | 字符串 (String) |
| 4 | pk_father | 上级项目PK | pk_father | varchar(20) |  | 报表项目 (reportitem) |
| 5 | unaryoperator | 一元计算符 | unaryoperator | varchar(50) |  | 一元计算符 (unaryoperatorenum) |  | +=+ 加; |