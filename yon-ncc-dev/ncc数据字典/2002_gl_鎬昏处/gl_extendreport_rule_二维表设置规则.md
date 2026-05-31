# |<<

**二维表设置规则 (gl_extendreport_rule / nc.vo.gl.gl_extendreport.Entity)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2420.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_extendreportb | 二维表设置信息明细表主键 | pk_extendreportb | char(20) | √ | 主键 (UFID) |
| 2 | pk_extendreport | 二维表设置信息主键 | pk_extendreport | char(20) |  | 主键 (UFID) |
| 3 | columnname | 维度标题 | columnname | varchar(100) |  | 字符串 (String) |
| 4 | coordinateflag | 行列标志 | coordinateflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | bdinfotype | 档案类型 | bdinfotype | char(20) |  | 主键 (UFID) |
| 6 | codenameflag | 编码名称显示 | codenameflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_extendreportprop | 属性主键 | pk_extendreportprop | char(20) |  | 主键 (UFID) |
| 8 | itemorder | 顺序 | itemorder | int |  | 整数 (Integer) |
| 9 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |