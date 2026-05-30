# |<<

**订单期间成本表 (scaba_monthab / nc.vo.scaba.costprocess.entity.MonthabVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5088.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmonthabid | 订单期间成本 | cmonthabid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vmocode | 订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 8 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 10 | cmarcostclassid | 产品成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 11 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 12 | cprojectid | 产品项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 13 | ccustomerid | 产品客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cvendorid | 产品供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 15 | cproductorid | 产品生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 16 | beginabsmoney | 期初成本 | beginabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 17 | beginabsmoney_this | 期初成本-本层 | beginabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | beginabsmoney_up | 期初成本-上层 | beginabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | curtotalinmoney | 本期总投入 | curtotalinmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | curtotalinmoney_this | 本期总投入-本层 | curtotalinmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | curtotalinmoney_up | 本期总投入-上层 | curtotalinmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | inabsmoney | 吸收成本 | inabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | inabsmoney_this | 吸收成本-本层 | inabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | inabsmoney_up | 吸收成本-上层 | inabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | inpricediffmoney | 投入价差 | inpricediffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | inpricediffmoney_this | 投入价差-本层 | inpricediffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 27 | inpricediffmoney_up | 投入价差-上层 | inpricediffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | curtotaloutmoney | 本期总产出 | curtotaloutmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | curtotaloutmoney_this | 本期总产出-本层 | curtotaloutmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 30 | curtotaloutmoney_up | 本期总产出-上层 | curtotaloutmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | outabsmoney | 转出合格品成本 | outabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 32 | outabsmoney_this | 转出合格品成本-本层 | outabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | outabsmoney_up | 转出合格品成本-上层 | outabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 34 | closediffmoney | 关闭差异 | closediffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | closediffmoney_this | 关闭差异-本层 | closediffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | closediffmoney_up | 关闭差异-上层 | closediffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | balabsmoney | 期末在产 | balabsmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | balabsmoney_this | 期末在产-本层 | balabsmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | balabsmoney_up | 期末在产-上层 | balabsmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | outdiffmoney | 转出差异 | outdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | outdiffmoney_this | 转出差异-本层 | outdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | outdiffmoney_up | 转出差异-上层 | outdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | outwastemoney | 转出废品成本 | outwastemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | outwastemoney_this | 转出废品成本-本层 | outwastemoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | outwastemoney_up | 转出废品成本-上层 | outwastemoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | preoutdiffmoney | 预转出差异 | preoutdiffmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 47 | preoutdiffmoney_this | 预转出差异-本层 | preoutdiffmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 48 | preoutdiffmoney_up | 预转出差异-上层 | preoutdiffmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | outmoney | 转出成本 | outmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | outmoney_this | 转出成本-本层 | outmoney_this | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | outmoney_up | 转出成本-上层 | outmoney_up | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | pk_accbook | 核算账簿 | pk_accbook | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 53 | pk_setofbook | 账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 54 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 55 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 56 | cmaincostobjectid | 主成本对象 | cmaincostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 57 | orderclosed | 订单是否已关闭 | orderclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 58 | dataclosed | 关账时订单是否关闭 | dataclosed | char(1) |  | 布尔类型 (UFBoolean) |
| 59 | actualcaled | 实际成本计算是否处理 | actualcaled | char(1) |  | 布尔类型 (UFBoolean) |
| 60 | ccostcomponentid | 成本组件 | ccostcomponentid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 61 | pk_org_co | 业务单元 | pk_org_co | varchar(20) |  | 组织 (org) |
| 62 | nplanputnum | 生产数量 | nplanputnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 63 | nhinnum | 累计入库主数量 | nhinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | fproducttype | 产品类型 | fproducttype | int |  | 产品类型 (ProductTypeEnum) |  | 1=主产品; |