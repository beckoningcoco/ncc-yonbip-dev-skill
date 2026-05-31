# |<<

**预算调整单子表 (tb_adjustbill_b / nc.vo.tb.adjbill.AdjustBillBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustbill_b | 调整单子表主键 | pk_adjustbill_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_taskdef | 预算任务 | pk_taskdef | varchar(20) |  | 任务模板 (tbb_taskdef) |
| 3 | pk_task | 任务 | pk_task | varchar(20) |  | 任务管理 (tbb_task) |
| 4 | pk_workbook | 套表 | pk_workbook | varchar(20) |  | 套表管理 (billmanage) |
| 5 | pk_sheet | 表单 | pk_sheet | varchar(20) |  | 字符串 (String) |
| 6 | pk_cube | 应用模型 | pk_cube | varchar(20) |  | 应用模型 (tb_cube) |
| 7 | dimvector | 维度向量大文件 | dimvector | text(0) |  | BLOB (BLOB) |
| 8 | dimvector_str | 维度向量 | dimvector_str | varchar(1024) |  | 字符串 (String) |
| 9 | areaid | 区域信息 | areaid | varchar(50) |  | 字符串 (String) |
| 10 | cellposition | 单元格位置 | cellposition | varchar(50) |  | 字符串 (String) |
| 11 | sheetparadim | 页面维 | sheetparadim | varchar(300) |  | 字符串 (String) |
| 12 | pk_dataent | 主体 | pk_dataent | varchar(20) |  | 组织 (org) |
| 13 | pk_time | 计划期间 | pk_time | varchar(100) |  | 字符串 (String) |
| 14 | pk_metrics | 指标 | pk_metrics | varchar(300) |  | 字符串 (String) |
| 15 | pk_measure | 指标参照 | pk_measure | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 16 | others | 其他维度名称大文件 | others | text(0) |  | BLOB (BLOB) |
| 17 | others_str | 其他维度名称 | others_str | varchar(4000) |  | 字符串 (String) |
| 18 | dimothers | 其他维度大文件 | dimothers | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 19 | dimothers_str | 其他维度 | dimothers_str | varchar(1024) |  | 多维数据集 (tb_limitdef) |
| 20 | data_before | 调整前数据 | data_before | decimal(31, 8) |  | 数值 (UFDouble) |
| 21 | adjustdata | 调整数据 | adjustdata | decimal(31, 8) |  | 数值 (UFDouble) |
| 22 | data_after | 调整后数据 | data_after | decimal(31, 8) |  | 数值 (UFDouble) |
| 23 | adjustnote | 调整意见 | adjustnote | varchar(500) |  | 字符串 (String) |
| 24 | dim1 | 动态维度1 | dim1 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 25 | dim2 | 动态维度2 | dim2 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 26 | dim3 | 动态维度3 | dim3 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 27 | dim4 | 动态维度4 | dim4 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 28 | dim5 | 动态维度5 | dim5 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 29 | dim6 | 动态维度6 | dim6 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 30 | dim7 | 动态维度7 | dim7 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 31 | dim8 | 动态维度8 | dim8 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 32 | dim9 | 动态维度9 | dim9 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 33 | dim10 | 动态维度10 | dim10 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 34 | dim11 | 动态维度11 | dim11 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 35 | dim12 | 动态维度12 | dim12 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 36 | dim13 | 动态维度13 | dim13 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 37 | dim14 | 动态维度14 | dim14 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 38 | dim15 | 动态维度15 | dim15 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 39 | dim16 | 动态维度16 | dim16 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 40 | dim17 | 动态维度17 | dim17 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 41 | dim18 | 动态维度18 | dim18 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 42 | dim19 | 动态维度19 | dim19 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 43 | dim20 | 动态维度20 | dim20 | varchar(20) |  | 多维数据集 (tb_limitdef) |
| 44 | uniqkey | 单元格标识 | uniqkey | varchar(99) |  | 字符串 (String) |
| 45 | paramap | 参数 | paramap | text(0) |  | BLOB (BLOB) |
| 46 | data_before2 | 调整前值 | data_before2 | varchar(128) |  | 字符串 (String) |
| 47 | adjustdata2 | 调整值 | adjustdata2 | varchar(128) |  | 字符串 (String) |
| 48 | data_after2 | 调整后值 | data_after2 | varchar(128) |  | 字符串 (String) |
| 49 | pk_dept | 部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 50 | freevalue1 | 预留项1 | freevalue1 | varchar(500) |  | 字符串 (String) |
| 51 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 52 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 53 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 54 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 55 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 56 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 57 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 58 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 59 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 60 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |