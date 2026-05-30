# |<<

**作业分割详情 (cca_jobresultb / nc.vo.cca.jobresult.JobResultBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1285.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_jobresultb | 作业分割详情 | pk_jobresultb | char(20) | √ | 主键 (UFID) |
| 2 | pk_factorgroup | 要素组 | pk_factorgroup | varchar(20) |  | 核算要素组 (factorgroup) |
| 3 | pk_factor | 核算要素 | pk_factor | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 4 | splitbamount | 待分割核算账簿金额 | splitbamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | splitglamount | 待分割全局金额 | splitglamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | splitgrpamount | 待分割集团金额 | splitgrpamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 7 | jobvolume | 计划工作量 | jobvolume | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | pk_activity | 作业 | pk_activity | varchar(20) |  | 作业档案 (bd_activity) |
| 9 | weight | 权重 | weight | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | ratio | 分割比例 | ratio | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | bookamount | 核算账簿金额 | bookamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 12 | pk_bookcurrtype | 核算账簿币种 | pk_bookcurrtype | varchar(20) |  | 币种 (currtype) |
| 13 | glamount | 全局金额 | glamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 14 | pk_glcurrtype | 全局币种 | pk_glcurrtype | varchar(20) |  | 币种 (currtype) |
| 15 | grpamount | 集团金额 | grpamount | decimal(28, 8) |  | 金额 (UFMoney) |
| 16 | pk_grpcurrtype | 集团币种 | pk_grpcurrtype | varchar(20) |  | 币种 (currtype) |
| 17 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |