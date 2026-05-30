# |<<

**抽样计划表明细 (qc_sampleplan_b / nc.vo.qc.sampleplan.entity.SamplePlanItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4867.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sampleplan_b | 抽样计划表明细主键 | pk_sampleplan_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | nbatchnum | 批量 | nbatchnum | int |  | 整数 (Integer) |
| 5 | nsamplenum1 | 样本量1 | nsamplenum1 | int |  | 整数 (Integer) |
| 6 | nacceptnum1 | 接收数1 | nacceptnum1 | int |  | 整数 (Integer) |
| 7 | nrejectnum1 | 拒收数1 | nrejectnum1 | int |  | 整数 (Integer) |
| 8 | nsamplenum2 | 样本量2 | nsamplenum2 | int |  | 整数 (Integer) |
| 9 | nacceptnum2 | 接收数2 | nacceptnum2 | int |  | 整数 (Integer) |
| 10 | nrejectnum2 | 拒收数2 | nrejectnum2 | int |  | 整数 (Integer) |
| 11 | nsamplenum3 | 样本量3 | nsamplenum3 | int |  | 整数 (Integer) |
| 12 | nacceptnum3 | 接收数3 | nacceptnum3 | int |  | 整数 (Integer) |
| 13 | nrejectnum3 | 拒收数3 | nrejectnum3 | int |  | 整数 (Integer) |
| 14 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |