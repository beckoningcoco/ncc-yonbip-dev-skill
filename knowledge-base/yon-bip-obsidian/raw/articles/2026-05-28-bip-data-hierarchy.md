基础数据分级管理
最后更新时间：2024-01-21
本文摘要

该红皮书旨在描述基础数据分级管理相关节点的技术原理、设计架构以及业务流程相关的技术内容。同时，也提供了基础数据分级管理的具体使用场景以及对外提供的相关接口（具体的使用方式以及参数说明）。

如果在业务开发过程中使用到了基础数据分级管理相关的内容，但是又不了解具体的使用方式以及场景，则可以通过该文档来详细了解。

具体的使用场景包括：单据基于校验组织档案管理权限的保存，单据基于组织的共享的查询，基于分级管理构建分配模式开发，及新分配模式的开发。

对外开放的 RPC接口。

第一章 基本概念
背景

对于不同规模、管理策略不同的企业内部管理来说，基础数据存在不同的管理要求， 支持不同企业用户对基础数据管理的要求。

基础数据的级次分为：社会级、租户级、组织级。

*           1. **社会级的数据：**用友云统一运营，数据共享给所有租户可见。
2. **租户级数据：**在租户内，由有权限的用户维护。

*  租户级数据对于租户内所有组织**共享可见。**
*  租户级数据对租户内组织来说，可见不可维护，组织支持在租户级数据基础上，维护有权限修改的组织级属性，此时按组织产生新的业务属性表。
3. **组织级数据：**租户内由有权限的用户维护。

*  组织级数据对于本组织可见可维护；对于其他组织来说，有两种应用模式：私有、共享下级。私有；数据只在本组织使用，其他组织不可见；共享下级：数据对于下级组织共享可见
*  组织级数据分配给下级组织后，下级组织可见，并可在来源组织数据的基础上，维护有权限修改的本组织属性，此时按组织产生新的业务属性表。

第二章 技术架构
总体架构设计

分级管控基于不同的档案，对不同的组织进行设置。对组织进行共享范围和共享历史待办的处理。

业务流程设计

基础数据管理员设置好分级管理，根据实际业务配置好组织档案的共享关系。当组织启用后，会在共享给该组织的组织上产生历史待办。可以进行相应的处理

当共享时，具体的档案接收到分级管控的事件后，进行历史档案的共享操作。档案调用接口，根据是否开启分级管控及共享的范围来控制档案的显示。

第三章 功能介绍
功能概述

支持基础数据集中管理，也支持对于多地点、多板块的组织，有自己的基础数据管理，并且可以为下级组织所用。

集团多组织分级管理的模型中，可以基于组织结构来指定哪些组织有基础数据管理职能，且可以勾选该组织可以管理哪些基础档案。其中：企业账号在授权时，作为组织结构的根节点存在，也可以做管控配置，企业账号默认可以维护所有支持管控模式配置的档案。

有基础数据管理职能的组织，可以选择自己哪些档案（非分类的档案）共享给下级组织。其中：租户的基本档案默认是共享下级的，组织级的基本档案默认不共享下级。如果共享给下级组织，则当前组织的数据除了本组织可见可用外，下级组织都可见

可用；

如果不共享，则当前组织的基础数据只能为本组织所用。对于高端应用来说，客户

/供应商/物料档案上支持分配功能，可以将租户级/组织级数据分配到下级组织。

组织可见可用的数据为组织私有数据及所有上级组织共享或者分配的基础数据。功能授权的模型按用户+角色+组织来授权

功能操作
用户界面、交互及输入字符

只购买中端 ERP 产品，如果没有启用多组织，此菜单不可见。

支持按受控档案类型定义哪些组织可维护，并且数据是否要共享。

支持按组织查看并定义，组织可维护哪些档案，并且数据是否要共享。

支持定义共享范围，以及定义是否共享给被共享的组织下级组织。

组织有启用或新增时,会在档案共享该组织的组织上产生待办,是否要把历史档案共享给该组 织.(目前只有客户,物料,供应商,付款协议,收款协议,供应商分类,物料分类 支持该功能),是: 共享.否:不共享

5.批量操作:支持批量对档案设置.

处理流程及业务规则/算法字符

基本假设：

租户级的应用档案编码在租户下唯一。

基础数据的管控，是否可以在组织级，以及哪些组织，是由租户管理员来确定的。基础数据的管理级次是基于组织架构的。即：用友云应用，如果有分层管理的需求，

必须创建并且依赖组织架构，暂不考虑部门级的组织有基础数据管理的需求。

业务领域在使用基础数据时，根据业务场景需求决定如何找到可用的数据范围，根据具体领域需求确定。

财务服务中，多数场景下，业务领域的主组织本身是实体组织，可以找到本组织及其它组织（包括租户）共享的数据。对于无法找到组织的场景，比如产品线利润中心模式下，产品线本身会跨多公司、多组织从管理会计角度进行核算，此时财务可见的业务数据，应该是其核算覆盖业务组织可见的数据范围，即根据核算业务委托关系来确定。

具体规则是：可参照本组织（若本组织是组织）可见的档案（含全局+其它组织共享+本组织），还可以参照到根据核算委托关系对应的委托主体的组织可见的档案（含全局+其它组织共享+本组织）。

供应链/制造场景中，多数场景中，业务领域主组织（销售/采购/库存组织）本身是实体组织，此时可以找到本组织或者其它组织（包括租户）共享的数据；即使本身不是组织，但其所属组织或者上级组织为组织，可以基于此组织确定可见数据范围。

业务规则：

支持基础数据集中管理，也支持对于多地点、多板块的组织，有自己的基础数据管理，并且可以为其它组织所用。

集团多组织分级管理的模型中，可以基于组织结构来指定哪些组织有基础数据管理权，且可以勾选该组织可以管理哪些基础档案。其中：企业账号级在授权时，作为组织结构的根节点存在，也可以做管控配置，企业账号级默认可以维护所有基础数据。

有基础数据管理职能的组织（包括企业账号级），可以选择自己哪些档案（非多级分类的档案）共享给其它组织。其中：企业账号级的基本档案默认是全局共享的，组织级的基本档案默认不共享。

如果共享给其它组织（包括下级组织和指定组织），则当前组织的数据除了本组织可见可用外，其它被共享的组织都可见可用；

如果不共享，则当前组织的基础数据只能为本组织所用。

组织可见可用的数据为本组织私有数据及所有其它组织直接共享数据

非本组织（其它组织共享）的基本档案（除三大档案和收、付款协议外）可查看但不可修改，交互上可处理为编辑、删除按钮不可见。

非本组织的三大档案（客户、供应商、物料）数据，被共享组织有使用权，可以查看，支持修改，一旦编辑，主键不变，但会复制出当前组织的业务属性。在业务获取档案业务属性时，如果有对应组织级业务属性，则以组织为准，否则就取数据所属组织的业务属性。说明：非本组织的档案只有使用权，没有管理权，可以在一定范围内编辑组织级属性，但不能对数据进行停用、启用操作。

非本组织（其它组织共享的）的收、付款协议数据，被共享组织（使用组织）有使用权，可以查看，但不支持修改和启停；支持删除操作，但是使用组织视角的【删除】删除的是该档案数据的共享关系（即使用组织表中当前的组织记录），不会删除档案数

据。

支持基于组织结构来指定哪些档案支持对共享范围组织的“自动共享”。自动共享打开时，档案新增时会共享给所有共享范围组织（包括下级组织和指定组织），关闭时，档案可以在新增保存时指定共享范围内的组织进行共享（需要档案增加选择流程做适配）。其中：所有组织节点的自动共享都默认打开。

功能授权的模型按用户+角色+组织来授权，即：

除了要考虑用户分配的角色所具有的功能权限外，还需要考虑用户+角色所关联的组织来决定可以维护哪些组织的基础数据。其中租户级可以认为是一种特殊的组织，是组织的根节点。其中：没有勾选基础数据管理职能的组织不能被参照出来授权。

与 NC V6X 的区别在于，不再通过两个节点分别授权来体现用户维护租户级或者组织级的数据；从应用的角度，将租户级数据、其它组织共享的数据，与本组织数据通过一个节点来维护和查询，提升用户维护和查询的体验。

管控模式即组织是否有基础数据管理权选项是否可切换：

原来没有基础数据管理职能的组织和档案，可以直接勾选。
原来有基础数据管理职能的组织，如果要取消某个档案的基础数据管理职能， 需要检查当前组织是否已有定义且非停用（含初始化/启用态）的对应档案数据：如果没有，则直接取消。如果有，则提示：当前组织下仍然存在未停用数据，无法取消基础数据管理职能。继续取消当前组织的基础数据管理权，将会自动停用当前组织的基础数据，由用户确认是否还要取消。取消基础数据管理职能的组织，将无法增加和维护当前组织的数据，以前维护的数据可以作为停用数据查询出来，但不能再被维护和启用。

数据共享是否可切换：

企业账号级档案共享模式默认全局共享。组织级有管理权的档案，默认不打开共享。
只有有档案管理权的组织才可开启共享模式。
适配了分级管控的档案，在档案的维护保存时，需要将档案的共享关系数据进行实体化保存，即保存一份档案数据，并保存该档案跟包括管理组织在内的所有使用组织的关联关系（1 份档案+n 份关系）。这样，即使分级管控有调整，也不影响已创建档案的共享。
由非共享模式变更为共享模式时或设置共享范围时，弹窗选择共享范围，在共享范围的组织树中做如下处理：

企业账号级（租户）隐藏。

默认选中本组织(数据共享组织)并且不可取消勾选。默认共享给本组织的下级，可 取消勾选;指定范围的组织可勾选，可取消。

打开/关闭共享或者共享范围调整时，触发的档案操作：

打开共享下级时&下级组织增加之后，自动向下级组织共享历史档案
指定共享范围增加组织时，如果对应管理组织下已存在档案数据，询问是 否共享历史档案
共享开关关闭&删除共享组织（包括共享下级的组织）时，均不需要对历史 数据做任何校验，不处理历史数据

批量配置，复制粘贴或者应用到全部时：校验所有目标组织是否存在组织级数据。如果不存在，则粘贴后，目标组织的共享范围替换为源组织的共享范围。如果存在，则提示：目标组织下已经存在共享给其它组织使用的档案数据 ，操作不成功。

批量配置，打开批量【数据共享】按钮各组织节点联动打开时，共享范围应该默认共享下级。

树形档案不支持组织级（不包括企业账号级）共享，前端对各组织节点（不包括企业账号级）共享开关做禁用，并给出该规则的提示。

自动共享是否可切换：

所有组织节点（含企业账号级）默认打开自动共享。
自动共享可随时打开和关闭，不需要对历史数据进行校验。

适配商家模型：

分级管控组织树中，均隐藏商家创建的外部组织，包括共享范围选择列表等。
商家创建并同步创建外部组织时，同时该外部组织的分级管控后台数据中， 默认有所需商家级档案维护权，且不共享下级。
第四章 开发示例
接入模式

分级管控为独立的服务，开发人员可通调用分级管理提供的sdk 实现分级管理能力。引入 maven 依赖

com.yonyou.ucf

iuap-basedoc-mc-dubboapi

1.Iris

group : ucfmcservice

调用方配置如下

com.yonyou.iuap.service.MCSetManageService

com.yonyou.iuap.service.HierarchyManagerRestService

在代码中

@Autowired

private MCSetManageService mcSetManageService

直接注入

用户配置数据。为提供在管控配置的中的初始默认数据，需要根据当前租户开通的档案预置全局组织的数据（org_id 指定为当前要开发测试的租户的全局组织 id），默认情况下 ismd 与 isshare 都为是。

API 说明

接口：MCSetManageService 接口类型：rpc

接口说明：查询分级管理的可维护及可共享使用的组织范围

请求参数 CheckMCSetDTO 字段说明

参数	参数类****型	是否必****输	说明
userid	String	N	用户 ID
tenantid	String	Y	租户 ID
sysid	String	Y	sysid
orglist	List	N	多个主组织
orgid	String	N	单子主组织
isshare	Boolean	N	数据共享 true 开启 false 不开启
ismc	Boolean	N	档案管理权 true 开启 false 不开启
doctype	String	N	档案 uri 示例 aa.merchant.Merchant 基本档案用
docid	String	N	自定义档案 id 自定义档案用
*           1. []()[]()**isSettingShareRange 档案是否设置共享范围**


档案是否设置共享范围,不包含企业账号

/**

档案是否设置共享范围,不包含企业账号
@param checkMCSetDTO 档案参数
@return 档案设置了共享范围 true 否则 false
@throws BaseDocMCException 分级管理异常

*/

boolean isSettingShareRange(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException;

示例

public void isSettingShareRange () throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 自 定 义 档 案 ID checkMCSetDTO.setDocid("docid");

// 或者 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 租户下该档案是否设置了共享范围

// true 开启 false 没有

boolean isSettingShare = mcSetManageService.isSettingShareRange(checkMCSetDTO);

}

orgMCFilter 过滤开启档案管理权组织

将给定的主组织,过滤出开启档案管理权的组织并返回

/**

根据给定的档案组织,筛选出开启档案管控的组织
@param checkMCSetDTO 参 数 {@link CheckMCSetDTO}
参数说明:
tenantid 租户 ID 必输 {@link CheckMCSetDTO#setTenantid(String)}
sysid 必 输 {@link CheckMCSetDTO#setSysid(String)}
docid 自定义档案ID {@link CheckMCSetDTO#setDocid(String)}
doctype 基本档案 uri 例如 : aa.merchant.Merchant {@link CheckMCSetDTO#setDoctype(String)}
docid,doctype 二选一
组织ID 集合 必输 {@link CheckMCSetDTO#setOrglist(List)}
@return 档案开启管理权的组织集合
@throws BaseDocMCException 分级管理异常

*/

List orgMCFilter(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException;

示例

public void orgMCFilter () throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 自 定 义 档 案 ID checkMCSetDTO.setDocid("docid");

// 或者 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 主组织

checkMCSetDTO.setOrglist("orgIds")

// 开启档案管理权的组织

List mcOrgsList = mcSetManageService.orgMCFilter(checkMCSetDTO);

}

orgMCFilterByCondition 过滤档案管理权, 数据共享组织数据

过滤档案管理权,数据共享,自动共享 组织数据

/**

根据条件过滤出给定的组织

ismc true 开启档案管理权的组织

isshare true 开启数据共享的组织

isAutoShare true 开启自动共享的组织

@param checkMCSetDTO 分级管控参数

@return 符合条件的组织

@throws BaseDocMCException 分级管理异常

*/

List orgMCFilterByCondition(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException;

示例

public void orgMCFilterByCondition () throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 自 定 义 档 案 ID checkMCSetDTO.setDocid("docid");

// 或者 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 主组织

checkMCSetDTO.setOrglist("orgIds")

// 过滤出 开启档案管理权的 不需要传入 null checkMCSetDTO.setIsmc(true);

// 过滤出 开启数据共享的 不需要传入 null checkMCSetDTO.setIsshare(true);

// 过滤出 开启自动共享的 不需要传入 null checkMCSetDTO.setIsAutoShare(true);

// 符合条件的组织

List mcOrgsList = mcSetManageService.orgMCFilterByCondition(checkMCSetDTO);

}

orgRangeShareAllFilter 反向共享组织和共享下级接

口

项目和自定义档案用

/**

获取共享的组织为主组织的档案的分级管理组织,和共享下级为主组织的上级组织

主组织 +

其他组织共享给主组织的组织 (需开启数据共享) +

主组织的上级开启了共享下级的上级组织(需要开启数据共享,共享下级)

项目、自定义档案 调用

@param mcSetParam 分级管理参数 参数 {@link CheckMCSetDTO}

@return 组织ID 集合

@throws BaseDocMCException 分级管理异常

*/

List orgRangeShareAllFilter(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException;

示例

public void orgRangeShareAllFilter() throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 自 定 义 档 案 ID checkMCSetDTO.setDocid("docid");

// 或者 基本档案 uri 如 aa.merchant.Merchant setDocid 和 setDoctype 二选一,建议用setDoctype

checkMCSetDTO.setDoctype("uri");

// 主组织

checkMCSetDTO.setOrglist("orgIds")

// 符合添加组织

List mcOrgsList = mcSetManageService.orgRangeShareAllFilter(checkMCSetDTO);

}

orgRangeShareAll 获取共享组织和共享下级组织

客户,物料,收付款协议用

/**

获取共享组织和共享下级组织

计算 共享组织 + 共享下级 时 前提条件是 组织档案需开启档案管理权且开启共享 否则只返回传入的

组织

计算结果为:

add + 传入的主组织

add + 指定共享组织 (需开启档案管理权,开启共享,设置共享组织)

add + 共享下级 (需开启档案管理权,开启共享,共享下级)

客户,物料,收付款协议用

@param checkMCSetDTO 分级管理参数 参数 {@link CheckMCSetDTO}

@return 组织ID 集合 主组织 + 共享组织 + 共享下级组织

@throws BaseDocMCException 分级管理异常

*/ @Override

public List orgRangeShareAll(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException ;

示例

public void orgRangeShareAll() throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 主组织

checkMCSetDTO.setOrglist("orgIds")

// 符合添加组织

List mcOrgsList = mcSetManageService.orgRangeShareAll(checkMCSetDTO);

}

shareOrgShareSubDetail 获取共享组织和共享下级的详细信息

客户,物料 在用

/**

获取共享组织和共享下级的详细信息
@see MCSetManageService#orgRangeShareAll 和此方法获取的组织结果相同
只是对每一个组织有对应的详细的分级管理
@param mcSetParam 分级管理参数 参数 {@link CheckMCSetDTO}
@return MCSetResult 共享组织和共享下级结果
@throws BaseDocMCException 分级管理异常

*/ @Override

public MCSetResult shareOrgShareSubDetail(CheckMCSetDTO mcSetParam) throws BaseDocMCException ;

示例

public void shareOrgShareSubDetail() throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 主组织 ID

String masterId = "masterId";

// 设 置 主 组 织 ID checkMCSetDTO.setOrglist(Collections.singletonList(masterId));

// 获取共享组织和共享下级的详细信息

MCSetResult mcSetResult = mcSetManageService.shareOrgShareSubDetail(checkMCSetDTO);

// key orgId value 组织对应的分级管理详细信息

Map<String, MCSetDetailResult> detailResult = mcSetResult.getDetails();

//共享组织和共享下级组织,同 orgRangeShareAll 结果

List orgs = mcSetResult.getOrgIds();

MCSetDetailResult detailMC = detailResult.get(masterId);

// 是否开启自动共享 true 是 false 否

Boolean autoShare = detailMC.getAutoShare();

}

checkMCSet 判断单个组织 ID 是否开启档案管理权

/**

判断单个组织ID 是否开启档案管理权
@param mcSetParam 分级管理参数
参数说明:
tenantid 租户 ID 必输 {@link CheckMCSetDTO#setTenantid(String)}
sysid 必 输 {@link CheckMCSetDTO#setSysid(String)}
docid 档案ID {@link CheckMCSetDTO#setDocid(String)}
doctype 档案 code (uri) 例如 : aa.merchant.Merchant {@link CheckMCSetDTO#setDoctype(String)}
docid,doctype 二选一
设置单个组织ID {@link CheckMCSetDTO#setOrgid(String)}
@return true 开启档案管理权 false 没有开启
@throws BaseDocMCException 分级管理异常

*/

public boolean checkMCSet(CheckMCSetDTO mcSetParam) throws BaseDocMCException

示例

public void checkMCSet() throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

// 基本档案 uri 如 aa.merchant.Merchant checkMCSetDTO.setDoctype("uri");

// 主组织

checkMCSetDTO.setOrgid("orgId")

// 是否开启档案管理权

boolean isMC = mcSetManageService.checkMCSet(checkMCSetDTO);

}

isMCDocType 档案是否为分级管控档案

/**

档案是否为分级管控档案
@param checkMCSetDTO 档案参数
参数说明:
tenantid 租户 ID 必输 {@link CheckMCSetDTO#setTenantid(String)}
sysid 必 输 {@link CheckMCSetDTO#setSysid(String)}
doctype 基本档案 uri 例如 : aa.merchant.Merchant ,自定义档案传入自定义档案定义 ID {@link CheckMCSetDTO#setDoctype(String)}
@return 档案是否为分级管控的档案 true 是 false 否
@throws BaseDocMCException 分级管理异常

*/

boolean isMCDocType(CheckMCSetDTO checkMCSetDTO) throws BaseDocMCException;

示例

public void isMCDocType() throws BaseDocMCException {

MCSetManageService mcSetManageService = null;

CheckMCSetDTO checkMCSetDTO = new CheckMCSetDTO();

// 租户

checkMCSetDTO.setTenantid("tenantid");

// sysid

checkMCSetDTO.setSysid("diwork");//写死 diwork

//基本档案 uri 例如 : aa.merchant.Merchant ,自定义档案传入自定义档案定义 ID checkMCSetDTO.setDoctype("uri");

// 是否分级管理档案 true 是分级管控档案 false 不是分级管控档案

boolean isMCDocType = mcSetManageService.isMCDocType(checkMCSetDTO);

}

第五章 典型业务场景介绍
纯共享模式开发场景

一般为没有业务属性需求的基础数据开发使用。存储结构简单，单据使用时计算可使用的档案数据范围。数据在可管理组织创建，如果共享给下级，下级组织可见。

*           1. 档案维护服务：校验是否有权维护数据。


步骤 1、校验数据的组织是否满足组织权限（组织权限校验）

步骤 2、在后台保存服务中，增加分级管理的校验。校验中根据元数据和数据的组织 id 调用管控服务校验是否可维护数据

校验服务：MCSetManageService.checkMCSet(CheckMCSetDTO checkMCSetDTO)

true，步骤 4。false，步骤 3。

步骤 3、抛出失败异常“当前组织不支持维护 XXX 的数据”，返回界面显示。步骤 4、执行其他校验，保存数据，返回界面显示。

*           1. 档案维护界面查询服务：


步骤 1、查询组织权限，参考组织权限接口说明（可选，如果前端指定组织时，直接根据传入的组织调用步骤 2）。

步骤 2、根据要查询数据的组织列表查询分级管理的可见数据的组织范围。

查询服务：MCSetManageService.orgParentShareFilter(CheckMCSetDTO checkMCSetDTO)

示例代码：

@Autowired

private MCSetManageService mcSetManageService

//获取组织权限

orgIds = DataPermissionUtil.getDataPermission(serviceCode, token);

if(orgIds == **null **|| orgIds.isEmpty()) {

throw new BusinessException("当前用户没有组织权限");

}

//查询分级管理的可使用范围

CheckMCSetDTO checkMcSetDTO = new CheckMCSetDTO(); checkMcSetDTO.setOrglist(orgIds); checkMcSetDTO.setSysid("diwork"); checkMcSetDTO.setDoctype("bd.project.ProjectVO"); checkMcSetDTO.setTenantid(AppContext.getTenantId());

List mcOrgsList = mCSetManageService.orgParentShareFilter(checkMcSetDTO);

步骤 2、根据要查询数据的组织列表查询分级管理的可见数据的组织范围。

*           1. 档案参照：通过参照的IRefEvent 中增加参照数据查询前处理规则，根据参照类型判断实现 beforeTreeData()或 beforeGridData()方法。


@Autowired

private MCSetManageService mcSetManageService

@Override

**public void **beforeTreeData(RefEntity refEntity, Map<String, Object> refpara) {

**try **{

// 获取前端的组织参数

Object orgId = refpara.get(MddConstants.PARAM_ORG_ID); List orgIdList = **new **ArrayList<>(); orgIdList.add(orgId == **null **? **null **: orgId.toString());

// 查询分级管理的可使用数据组织范围

CheckMCSetDTO checkMcSetDTO = new CheckMCSetDTO(); checkMcSetDTO.setOrglist(orgIdList); checkMcSetDTO.setSysid("diwork"); checkMcSetDTO.setDoctype("bd.project.ProjectVO");// 档案类型编码checkMcSetDTO.setTenantid(AppContext.getTenantId());

List filterOrgIds = mCSetManageService.orgParentShareFilter(checkMcSetDTO); Object condition = refpara.get(MddConstants.PARAM_CONDITION);

condition = MddUiMetaHelper.appendCondition(condition, "orgid"/ 组 织 字 段 名 称 /, ConditionOperator.in.toString(), filterOrgIds);

refpara.put(MddConstants.PARAM_CONDITION, condition);

} **catch **(Exception e) {

logger.error(**"查询分级管理的使用范围失败:" **+ e.getMessage());

**throw new BaseDocRuntimeException("使用查询失败:" **+ e.getMessage());

}

}

分配模式开发场景

目前的三大档案采用的是分配的模式，通过将数据区区分为基础数据及业务数据。

基础数据为创建者管理，业务数据为使用者管理。两者间通过分配关系进行关联。数据模型关系如下：

规则如下：

基本信息上增加创建组织属性，业务信息上增加使用组织属性。
创建数据时，生成当前组织的基本信息及业务信息，及一条分配关系数据（默认创建者为是，分配使用为是）。
数据创建后，根据分级管理的接口，查询当前组织共享给其他组织的数据范围，为共享的组织生成分配关系（默认分配使用为否）。
维护界面查询数据时，按组织权限的组织查询查询分配关系数据，在查询基本信息，如果分配关系中分配使用为否时，查询创建组织下的业务数据，否则查询使用组织下的业务数据。
在维护数据时，如果创建组织=使用组织，则基本信息可维护，否则只能维护业务数据，在保存时，使用组织下的业务数据不存在，则创建，否则修改原有数据。

开发过程简单描述如下：

档案新增：

步骤 1、按创建组织校验组织权限。

步骤 2、按创建组织校验是否支持管控（过程同纯共享模式的校验）

校验服务：MCSetManageService.checkMCSet(CheckMCSetDTO checkMCSetDTO) 步骤 3、生成分配关系（创建者为是，分配使用为是）。

步骤 4、同时保存：基本信息、业务信息，分配关系。

步骤 5、根据管控查询项下级共享的组织范围（接口暂为提供，后续可能增加分配模式，需要提供单独的接口）。

步骤 6、根据查询到的范围生成分配关系数据。

档案维护：

步骤 1、判断是否本组织管理数据（创建组织=使用组织）。校验是否基本信息可修改。

步骤 2、根据分配关系判断是分配使用，如果已存在业务信息数据，步骤 3，否则步骤 4

步骤 3、更新业务信息数据。

步骤 4、插入业务信息数据，修改分配关系的分配使用为是。步骤 5、返回更新后数据。

档案维护界面查询：目前是通过三表关联查询数据。也可以分开查询。
档案参照：扩展方式同纯共享模式，直接根据分配关系关联查询，不需要调用管控接口。
分配模式改进版

原有的分配模式开发中适用范围表是组织*档案的一个笛卡尔积，存在严重的数据问题。经过改造最终出现了集合版的分配模式。该模式正在开发改造中，物料已经试用， 效果明显，极大的减少了数据量，标准的方式还在整理收集中，后续完成后（220630） 继续更新该文档。建议使用该模式作为标准模式

模型如下

数据模型如下  保存涉及的 sdk 和方法

com.yonyou.ucf

iuap-basedoc-mc-range

4.1.9-release

com.yonyou.iuap.basedoc.mc.service.impl.GroupServiceImpl#saveGroup(org.imeta.orm. base.BizObject, java.lang.String)

1）保存与查询逻辑

档案保存时，根据共享规则将数据关联到对应的共享范围集合上，如果未找到匹配和集合则生成新的；档案适用范围的调整保存时，逻辑亦是如此。

档案查询规则：匹配查询包含当前用户有权限的组织的共享范围集合，这些集合关联的档案用户可见。

详情展示：在档案下查看适用组织时：直接查询档案关联的共享范围集合即可。2）历史数据升级

历史数据升级，将相同的档案下的适用组织范围合并成“共享范围集合”，关联到对应档案上。sdk 提供升级方法,各项目工程定时调用的方式来实现.升级方式按照租户维度来升级.

3）集合变化

共享范围有新增（包括增加了指定组织和打开了共享下级而下级新增了组织的情况），需要批量按照档案保存逻辑，处理档案关联的共享范围集合数据。

管控规则调整（包括模式切换和共享范围调整），不影响历史数据；

以物料举例新增修改

保存时 pub_org_group_detail 根据传入的组织集合，查询是否有合适的集合，没有则新增集合。返回获得集合id ，并设置到 product 中；productdetail 和改造前处理逻辑一致。

查询：

查询当前用户有权限的主组织==》在集合关系表中，筛选出集合 id；
通过集合 id 获取物料基础信息(有权限的主组织权限+有权限的组织的共享的组织范围)
productdetail 获取当前物料的组织级属性

查询语句

SELECT product.* , set_detail.org_id , detail.* from pub_org_group_detail

set_detail JOIN product product on product.group_id=set_detail.group_id and

product.tenant_id=set_detail.tenant_id

LEFT JOIN productdetail detail

on set_detail.org_id=detail.orgId and

set_detail.tenant_id=detail.tenant_id and product.id=detail.productid

where

product.tenant_id=1841156173795584

and

set_detail.org_id=1842603901636864;

未修改组织级数据的，在内存中用租户级补全。

同一个集合会对多个物料；一个物料只对一个集合

数据关系：

A1 组织共享给指定组织 A2、A3

**product **1000 个物料

Id	orgId	iCreatorType	set_id(集合id)
P1	A1	1	S1

**set_detail **3 条数据

set_id	org_id	说明(set_id 和
org_id 联合主键)
S1	A1
S1	A3
S1	A2

productdetail

id	productid	set_id	iRangeType	orgId
D1	P1	S1	1	A1
D2	P1	S1	0	A3