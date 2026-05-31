# |<<

**批次追溯条件 (mm_mobatchtrace_c / nc.vo.mmpac.batchass.trace.param.BatchTraceCondVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3695.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cid | 主键 | cid | varchar(50) | √ | 字符串 (String) |
| 2 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 3 | cmaterialoid | 产品 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 4 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 5 | vbatchcode | 库存批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 6 | vbatchcodeid | 库存批次号id | vbatchcodeid | char(20) |  | 主键 (UFID) |
| 7 | bopenbyzl | 按照主料展开 | bopenbyzl | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | vprodbatchcode | 生产批次号 | vprodbatchcode | varchar(50) |  | 字符串 (String) |
| 9 | vprodbatchcodeid | 生产批次号id | vprodbatchcodeid | char(20) |  | 主键 (UFID) |
| 10 | cserialcodeid | 序列号标识 | cserialcodeid | char(20) |  | 主键 (UFID) |
| 11 | vserialcode | 序列号 | vserialcode | varchar(40) |  | 字符串 (String) |
| 12 | pk_wr_serialno | 生产报告序列号 | pk_wr_serialno | varchar(20) |  | 字符串 (String) |