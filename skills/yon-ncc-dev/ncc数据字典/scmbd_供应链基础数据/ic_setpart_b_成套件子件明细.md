# |<<

**成套件子件明细 (ic_setpart_b / nc.vo.ic.setpart.entity.SetPartBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2977.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_setpart_b | 子件明细主键 | pk_setpart_b | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialoid | 配件编码 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | pk_partunit | 配件主单位 | pk_partunit | varchar(20) |  | 计量单位 (measdoc) |
| 5 | childsnum | 父含子数 | childsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | partpercent | 单件单价权数 | partpercent | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | bpriceflag | 按子件询报价 | bpriceflag | char(1) |  | 布尔类型 (UFBoolean) |