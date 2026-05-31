# |<<

**高值收费单子表 (hstf_highconsum_b / nc.vo.hstf.highconsumable.HighConsumBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2761.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_high_b | 收费单明细 | pk_high_b | char(20) | √ | 主键 (UFID) |
| 2 | crowno | 行号 | crowno | varchar(50) |  | 字符串 (String) |
| 3 | chargecode | 收费项目编码 | chargecode | varchar(50) |  | 字符串 (String) |
| 4 | chargename | 收费项目名称 | chargename | varchar(50) |  | 字符串 (String) |
| 5 | castunit | 收费单位 | castunit | varchar(50) |  | 字符串 (String) |
| 6 | nastnum | 收费数量 | nastnum | varchar(50) |  | 字符串 (String) |
| 7 | ncostprice | 收费单价 | ncostprice | varchar(50) |  | 字符串 (String) |
| 8 | nmny | 收费金额 | nmny | varchar(50) |  | 字符串 (String) |
| 9 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 10 | materialpackage | 耗材包包码 | materialpackage | varchar(50) |  | 字符串 (String) |
| 11 | suppliercode | 寄存供应商编码 | suppliercode | varchar(50) |  | 字符串 (String) |
| 12 | suppliername | 寄存供应商名称 | suppliername | varchar(500) |  | 字符串 (String) |
| 13 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 字符串 (String) |
| 14 | barcode | 收费物料条码 | barcode | varchar(50) |  | 字符串 (String) |
| 15 | operatorcode | 计费员编码 | operatorcode | varchar(50) |  | 字符串 (String) |
| 16 | operatorname | 计费员名称 | operatorname | varchar(50) |  | 字符串 (String) |
| 17 | operatordeptcode | 计费员部门编码 | operatordeptcode | varchar(50) |  | 字符串 (String) |
| 18 | operatordeptname | 计费员部门名称 | operatordeptname | varchar(50) |  | 字符串 (String) |
| 19 | pk_material | 物料 | pk_material | varchar(20) |  | 物料基本信息（多版本） (material) |
| 20 | pk_measdoc | 计量单位 | pk_measdoc | varchar(20) |  | 计量单位 (measdoc) |
| 21 | noutnum | 出库数量 | noutnum | varchar(50) |  | 字符串 (String) |
| 22 | noutprice | 出库单单价 | noutprice | varchar(50) |  | 字符串 (String) |
| 23 | noutmny | 出库金额 | noutmny | varchar(50) |  | 字符串 (String) |
| 24 | coutrow | 出库单行号 | coutrow | varchar(50) |  | 字符串 (String) |
| 25 | vfree1 | 成本价 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 26 | vfree2 | 零售价 | vfree2 | varchar(101) |  | 自由项 (Custom) |
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