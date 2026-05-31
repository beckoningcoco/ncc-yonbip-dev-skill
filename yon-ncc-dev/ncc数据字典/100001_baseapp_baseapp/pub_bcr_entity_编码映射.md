# |<<

**编码映射 (pub_bcr_entity / nc.pub.billcode.vo.CodeEntityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4705.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_billcodeentity | 主键 | pk_billcodeentity | char(20) | √ | 主键 (UFID) |
| 2 | metaid | 关联元数据 | metaid | varchar(36) |  | 实体 (entity) |
| 3 | ename | 名称 | ename | varchar(30) |  | 字符串 (String) |
| 4 | elength | 长度 | elength | int |  | 整数 (Integer) |
| 5 | defaultrule | 默认规则 | defaultrule | varchar(100) |  | 字符串 (String) |
| 6 | ruledesc | 规则描述 | ruledesc | varchar(150) |  | 字符串 (String) |
| 7 | firstvar | 第一个变量 | firstvar | varchar(50) |  | 字符串 (String) |
| 8 | secondvar | 第二个变量 | secondvar | varchar(50) |  | 字符串 (String) |
| 9 | styl | 补位方式 | styl | varchar(50) |  | 补位方式 (fillstyleenum) |  | 0=右补位; |