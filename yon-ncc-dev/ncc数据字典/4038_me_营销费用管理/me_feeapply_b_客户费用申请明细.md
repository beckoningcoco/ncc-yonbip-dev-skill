# |<<

**客户费用申请明细 (me_feeapply_b / nc.vo.me.m4641.entity.BillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3612.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 客户费用申请明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cassumeorgid | 费用承担单位 | cassumeorgid | varchar(20) |  | 组织 (org) |
| 7 | cassumeorgvid | 费用承担单位版本信息 | cassumeorgvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | cassumedeptid | 费用承担部门 | cassumedeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cassumedeptvid | 费用承担部门版本信息 | cassumedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | ccostsubjid | 收支项目 | ccostsubjid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 11 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 12 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 13 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 14 | cprofitcentervid | 利润中心版本信息 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 16 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 17 | cfeeprojectid | 费用归集项目 | cfeeprojectid | varchar(20) |  | 项目 (project) |
| 18 | cfeecustomerid | 费用归集客户 | cfeecustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | napplymny | 费用申报金额 | napplymny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | iapplyratio | 客户费用支持比例% | iapplyratio | int |  | 整数 (Integer) |
| 21 | norigmny | 费用支持金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nmny | 本币费用支持金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ngroupmny | 集团本币费用支持金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nglobalmny | 全局本币费用支持金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntotalexemny | 累计核报金额 | ntotalexemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | bfeecloseflag | 费用关闭 | bfeecloseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | ccloserid | 关闭人 | ccloserid | varchar(20) |  | 用户 (user) |
| 28 | dclosedate | 关闭日期 | dclosedate | char(19) |  | 日期 (UFDate) |
| 29 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 30 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |